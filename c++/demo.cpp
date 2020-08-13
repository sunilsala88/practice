#include<bits/stdc++.h>

using namespace std; 
  
int main() 
{ 
    // Initializing 2D vector "vect" with 
    // values 
    int n=5;
    vector<vector<int> > vect{ { 0,1,1,1,1 }, 
                               { 1,0,1,1,0 }, 
                               { 1,1,0,1,1 },
                               { 0,0,0,0,0 },
                               { 1,1,0,1,0 } }; 
  
    // Displaying the 2D vector 
    for (int i = 0; i < vect.size(); i++) { 
        for (int j = 0; j < vect[i].size(); j++) 
            cout << vect[i][j] << " "; 
        cout << endl; 

  }
 

}
