class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
    
        if(string_list==null) return new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s:string_list){
            char [] arr=s.toCharArray();
            Arrays.sort(arr);
            String converted=String.valueOf(arr);
            if(map.containsKey(converted)){
                map.get(converted).add(s);
                
            }
            else{
                List<String> na=new ArrayList<>();
                na.add(s);
                map.put(converted,na);
            }
            
        }
        List<List<String>> ans=new ArrayList<>();
        for(Map.Entry<String, List<String>> group: map.entrySet()){
            ans.add(group.getValue());
        }
        return ans;
    }
}
