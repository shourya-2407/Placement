// 2 pointers approach
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            char currFirst = s.charAt(start);
            char currLast = s.charAt(end);

            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            } else if(!Character.isLetterOrDigit(currLast)){
                end--;
            } else{
                if(Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}

// one more solution
class Solution {
    private char toLower(char c) {
        if (c <= 'z' && c >= 'a') return c;
        return (char)(c - 'A' + 'a');
    }

    private boolean isChar(char c) {
        return (c <= 'z' && c >= 'a') ||
                (c <= 'Z' && c >= 'A') || 
                (c <= '9' && c >= '0');
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while (left < right && !isChar(s.charAt(left))) {
                left++;
            } 
            while (left < right && !isChar(s.charAt(right))) {
                right--;
            } 
            if(toLower(s.charAt(left)) != toLower(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
