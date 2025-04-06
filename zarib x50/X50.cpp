#include <iostream>
#include <vector>
#include <vector>

using namespace std;


struct array
{
    int size;
    vector<pair<int,int>> a();
};

vector<pair<int,int>> makevector (int min , int max , int size){
    vector <pair<int,int>> a(size);
    for (size_t i = 0; i < max-min+1; i++)
    {
        a[i].first = 0;
        a[i].second = min+i;
    }
    return a;
}

vector<pair<int,int>> returnFinal(vector<pair<int,int>> v1 , vector<pair<int,int>> v2 , int power){
    if(power == 1){
        return v2;
    }
    int min = v1[0].second+v2[0].second;
    int max = v1[v1.size()-1].second+v1[v2.size()-1].second;

    vector<pair<int,int>> v3 = makevector(min , max , max-min+1);

    for (size_t i = 0; i < v1.size(); i++)
    {
        for (size_t j = 0; j < v2.size(); j++)
        {
           int sum = v1[i].second+v2[j].second;
           for (size_t k = 0; k < v3.size(); k++)
           {
            if(sum == v3[k].second){
                v3[i].first += v1[i].first*v2[j].first;
            }
           }
            
        }
        
    }
    return returnFinal(v1 , v3 , power -1);
    
}

void findCoefficient (vector<pair<int,int>> v, int aim){
    for (size_t i = 0; i < v.size(); i++)
    {
        if(aim == v[i].second){
            cout <<"co iS "<<v[i].first<<endl;
            return;
        }
    }
    cout<<"this power doesnt exist!";
}

int main(){
    int size,power;
    cout <<"enter rows size , and the power"<<endl;
    cin >>size>>power;
    vector <pair<int,int>> a(size);
    for (size_t i = 0; i < size; i++)
    {
        cout<<"entre the Coefficient and the power of the house"<<i<<endl;
        cin >> a[i].first;
        cin >> a[i].second;
    }
    
    int aim;
    cout <<"enter the power value you want to now its coefficient"<<endl;
    cin >> aim;

    vector<pair<int,int>> finall = returnFinal(a,a,power);
    findCoefficient(finall,aim);
}

