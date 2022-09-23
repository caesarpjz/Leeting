class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
//         Map<Integer, Integer> myTreeMap = new TreeMap<>();
//         Stack<Integer> myStack = new Stack<>();
//         for (int i = temperatures.length - 1; i >= 0; --i) {
//             int temp = temperatures[i];
//             if (i == temperatures.length - 1) {
//                 temperatures[i] = 0;
//             } else {
//                 Set set = myTreeMap.entrySet();
//                 Iterator k = set.iterator();
//                 int flag = 123;
//                 // Traverse map and print elements
//                 while (k.hasNext()) {
//                     Map.Entry curr = (Map.Entry) k.next();
//                     if (( (int) curr.getValue() ) > temp) {
//                         temperatures[i] = (int) curr.getKey() - i;
//                         flag = 154;
//                         break;
//                     }
//                 }
                
//                 if (flag == 123) {
//                     temperatures[i] = 0;
//                 }
//             }
            
            
//             myStack.add(temp);
//             myTreeMap.put(i, temp);
            
//         }
        
//         return temperatures;
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }
}