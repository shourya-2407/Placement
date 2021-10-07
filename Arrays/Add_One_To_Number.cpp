//Logic: Brute Force Method

vector<int> Solution::plusOne(vector<int> &A) {
    int carry = 1;

    for(int i = A.size() - 1; i >= 0; i--){
        int sum = A[i] + carry;
        A[i] = sum % 10;
        carry = sum / 10;
    }
    if(carry != 0){
        //cout << "True";
        int n = A.size();
        A.resize(n + 1);
        int i = n;
        while(i != 0){
            A[i] = A[i - 1];
            i--;
        }
        A[0] = carry;
    }
    for(int i=0;i<A.size();i++){
        if(A[i]==0) {A.erase(A.begin()); i--;}
        else break;
    }
    return A;
}
