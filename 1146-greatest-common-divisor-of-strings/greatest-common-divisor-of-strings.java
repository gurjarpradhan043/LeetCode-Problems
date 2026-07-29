class Solution {
    public String gcdOfStrings(String str1, String str2) {
       int l1 = str1.length();
        int l2 = str2.length();
        
        for (int i = Math.min(l1, l2); i > 0; i--) {
    if (l1 % i == 0 && l2 % i == 0) {
    String candidate = str1.substring(0, i);
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    for (int j = 0; j < l1 / i; j++) {
    sb1.append(candidate);
    
}
for (int j = 0; j < l2 / i; j++) {
    sb2.append(candidate);
}

if (sb1.toString().equals(str1)
&&
sb2.toString().equals(str2)) {
    return candidate;
}
}
}
return "";
         
        
        
    }
}