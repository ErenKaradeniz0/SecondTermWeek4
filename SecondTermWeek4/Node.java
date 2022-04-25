package SecondTermWeek4;

public class Node {
    int name;
    Node leftname;

    public Node(int name) {
        this.name = name;
        this.leftname=null;
    }

    public Node(int name, Node leftname) {
        this.name = name;
        this.leftname = leftname;
    }

    public String getPath() {
        if(leftname==null){
         return name+"";
        }
        else{
            return leftname.getPath() +"/" +name;
        }

    }
}