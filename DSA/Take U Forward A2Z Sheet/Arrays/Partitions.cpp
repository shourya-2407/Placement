//Logic: 
// Find the indexes from front where the sum is equal to sum/3
// Find the indexes from back where the sum is equal to sum/3
// Run 2 for loops and find the pair of indices which may form a proper partition


int Solution::solve(int A, vector<int> &B) {
    int sum = 0;

    for(int i = 0; i < A; i++){
        sum += B[i];
    }
    if(sum % 3 != 0)
        return 0;

    sum /= 3;

    vector<int> prefix, suffix;

    int tmp_sum = 0;
    for(int i = 0; i < A - 2; i++){
        tmp_sum += B[i];
        if(tmp_sum == sum)
            prefix.push_back(i);
    }

    tmp_sum = 0;
    for(int i = A - 1; i >= 2; i--){
        tmp_sum += B[i];
        if(tmp_sum == sum)
            suffix.push_back(i);
    }

    int cnt = 0;
    for(int i=0;i<prefix.size();i++)
    {
        for(int j=0;j<suffix.size();j++)
        {
            // If prefix[i]<suffix[j]-1 that means the middle will obviously have sum=total_sum/3
            // so for that particular value of prefix[i] and suffix[j], a valid partition exists 
            if(prefix[i]<suffix[j]-1)
            {
                cnt++; // so increment the partition count
            }
        }
    }
    return cnt;
}
