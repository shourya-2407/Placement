//Logic: Simple maths

vector<int> Solution::repeatedNumber(const vector<int> &A) {
    long long int actual_sum;
    long long int actual_sq_sum;

    long long int n = A.size();
    actual_sum = (n*(n + 1))/2;
    actual_sq_sum = (n*(n+1)*(2*n + 1))/6;

    for(long long int i = 0; i < n; i++){
        actual_sum -= (long long int)A[i];
        actual_sq_sum -= (long long int)A[i] * (long long int)A[i];
    }

    long long int N1 = (actual_sum + actual_sq_sum/actual_sum)/2;
    long long int N2 = N1 - actual_sum;

    return {N2,N1};   
}
