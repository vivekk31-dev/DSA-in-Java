class Solution {
    public String convertDateToBinary(String date) {
        String ans = "";
        for (int i = 0; i < date.length(); i++) {
            if (date.charAt(i) == '-') {
                ans += "-";
            } else {
                int num = 0;
                while (i < date.length() && date.charAt(i) != '-') {
                    num = num * 10 + (date.charAt(i) - '0');
                    i++;
                }
                i--;
                ans += Integer.toBinaryString(num);
            }
        }
        return ans;
    }
}