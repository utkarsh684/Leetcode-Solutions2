class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int last=s.length()-1;
        StringBuilder sb= new StringBuilder(s);
        while(start<last){
            int flag1=0;
            int flag2=0;
            char ch1='a';
            char ch2='s';
            if(Character.isUpperCase(s.charAt(start))){
                ch1=Character.toLowerCase(s.charAt(start));
                flag1=1;
            }
            else{
                ch1=s.charAt(start);
            }
            if(Character.isUpperCase(s.charAt(last))){
                ch2=Character.toLowerCase(s.charAt(last));
                flag2=1;
            }
            else{
                ch2=s.charAt(last);
            }
            if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') && (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||     ch2=='u')){
                if(flag1==1){
                    ch1=Character.toUpperCase(ch1);
                }
                if(flag2==1){
                    ch2=Character.toUpperCase(ch2);
                }
                sb.setCharAt(start,ch2);
                sb.setCharAt(last,ch1);
                start++;
                last--;
            }
            else if((ch1!='a'&&ch1!='e'&&ch1!='i'&&ch1!='o'&&ch1!='u') && (ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||  ch2=='u')){
                if(flag1==1){
                    ch1=Character.toUpperCase(ch1);
                }
                if(flag2==1){
                    ch2=Character.toUpperCase(ch2);
                }
                start++;
            }
            else if((ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') && (ch2!='a'&&ch2!='e'&&ch2!='i'&&ch2!='o'&&ch2!='u')){
                if(flag1==1){
                    ch1=Character.toUpperCase(ch1);
                }
                if(flag2==1){
                    ch2=Character.toUpperCase(ch2);
                }
                last--;
            }
            else{
                start++;
                last--;
            }
        }
        return sb.toString();
    }
}
