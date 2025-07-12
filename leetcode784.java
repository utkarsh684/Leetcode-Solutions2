class Solution {
    public List<String> letterCasePermutation(String s) {
        if(s==null){
            return new LinkedList<>();
        }
        List<String> result=new ArrayList<>();
        function(s.toCharArray(),result,0);
        return result;
    }
    private void function(char[] ch,List<String> result,int index){
        if(index==ch.length){
            result.add(new String(ch));
            return;
        }
        if(ch[index]>='0' && ch[index]<='9'){
            function(ch,result,index+1);
            return;
        }
        ch[index]=Character.toLowerCase(ch[index]);
        function(ch,result,index+1);
        ch[index]=Character.toUpperCase(ch[index]);
        function(ch,result,index+1);
    }
}
