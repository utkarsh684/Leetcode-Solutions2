class Solution {
    
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list=new ArrayList<>();
        if(digits.length()==0){
            return new ArrayList<>();
        }
        function(digits,0,new StringBuilder(),list,map);
        return list;
    }
    private void function(String digits,int index,StringBuilder sb,List<String> list,Map<Character,String> map){
        if(index==digits.length()){
            list.add(sb.toString());
            return;
        }

        char ch=digits.charAt(index);
        String temp=map.get(ch);
        for(char ch2:temp.toCharArray()){
            sb.append(ch2);
            function(digits,index+1,sb,list,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
