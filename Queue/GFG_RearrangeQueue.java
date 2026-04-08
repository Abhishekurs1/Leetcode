class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 1;i<=n/2;i++){
           q2.add(q.remove()); 
        }
        while(q2.size()>0){
            q.add(q2.remove());
            q.add(q.remove());
        }
        return q;
    }
}


// Another Solution using Stack

class Solution {
    public Queue<Integer> rearrangeQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 1;i<=n/2;i++){
           st.push(q.remove()); 
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i = 1;i<=n/2;i++){
           st.push(q.remove()); 
        }
        
        // Rearrangement
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        
        // Reverse
        while(q.size()>0){
            st.push(q.remove());
        }
        
        while(st.size()>0){
            q.add(st.pop());
        }
	return q;
    }
}