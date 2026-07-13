class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
    //   moving all elements from main to helper
        while(main.size()>0){
          helper.add(main.remove());
        }
    //   add x in main queue

        main.add(x);
    //   moving all elements from helper to main

        while(helper.size()>0){
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        if(main.size()==0){
            return true ;
        }else{
            return false;
        }
    }
}
 