// Logic
// abs(A[i] - A[j]) - abs(i - j)
// Expanded the absolute values
// abs(A[i] + i) - abs(A[j] + j)
// abs(A[i] - i) - abs(A[j] - j)


int Solution::maxArr(vector<int> &A) {
    int n = A.size();
    vector<int> B(n), C(n);

    for(int i = 0; i < n; i++){
        B[i] = A[i] + i;
        C[i] = A[i] - i;
    }

    sort(B.begin(), B.end());
    sort(C.begin(), C.end());

    int val1 = B[n - 1] - B[0];
    int val2 = C[n - 1] - C[0];

    return (max(val1, val2));
}
