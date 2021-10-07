// Logic:  
// There can be only 2 elements with frequency greater than N/3
// Using Boyer-Moore's Voting Algorithm.


int Solution::repeatedNumber(const vector<int> &arr) {
  int ele1 = INT_MAX;
	int ele2 = INT_MAX;
	int votes1 = 0;
	int votes2 = 0;

	int n = arr.size();
    
	for(int i = 0; i < n; i++){
		if(arr[i] == ele1)
			votes1++;            
        else if(arr[i] == ele2)
			votes2++;
		else if(votes1 == 0){
			ele1 = arr[i];
			votes1 = 1;
		}
        else if(votes2 == 0){
			ele2 = arr[i];
			votes2 = 1;
		}
		else{
			votes1--;            
			votes2--;
        }
	}
	
	votes1 = 0;
	votes2 = 0;

    for(int i = 0; i < n; i++){
		if(arr[i] == ele1)	
			votes1++;
        else if(arr[i] == ele2)
            votes2++;
	}
	if(votes1 > n/3)
		return ele1;
    else if(votes2 > n/3)
        return ele2;
	else 
		return -1;
}
