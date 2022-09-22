class Solution {
    public String removeDuplicates(String s, int k) {
//         String[] myArr = s.split("");
//         // HashSet<String> mySet = new HashSet<>();
//         HashMap<String, Integer> myMap = new HashMap<>();
//         Stack<String> myStack = new Stack<String>();
//         String[] newArr = new String[myArr.length];
        
//         for (int i = 0; i < myArr.length; i++) {
//             String curr = myArr[i];
//             for (int j = 1; j < k; j++) {
//                 if (j + i >= myArr.length) {
//                     return String.join("", myStack.toString());
//                 }
//                 if (!myArr[j + i].equals(curr)) {
//                     if (!myMap.containsKey(curr)) {
//                         // myStack.add(curr);
//                         myMap.put(curr, 1);
//                     } else {
//                         // i only want unique and first position in the stack
//                         int value = myMap.get(curr) + 1;
//                         myMap.put(curr, value);
//                     }
//                     // mySet.add(curr);
//                     // myStack.add(curr);
//                     // i = i + j;
//                     myStack.add(curr);
//                     break;
//                 } else {
//                     if (j + i == k) {
//                         // int temp = k;
//                         // k = k + j + i;
//                         // j = j + i;
//                         i += k;
//                     }
//                 }
//             }
//         }
        
//         // check inside the stack now
// //         while (!myStack.isEmpty()) {
// //             String curr = myStack.pop();
            
// //         }
//         return "abc";
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(stack, 0, i);
    }
}