class student{
    int sid;
    String name;
    public student(int sid,String name)
    {
        this.sid = sid;
        this.name = name;

    }
    public String toString()
    {
        return "student{" +
        "sid=" + sid +
                ", name='" + name + '\'' +
                '}';

    }


}
class Node{
    public student data;
    public Node left;
    public Node right;
    public Node(student data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearch{
    public static Node insert(Node root,Node newnode)
    {
        if(root==null)
        {
            root = newnode;
        }
        if(root.data.sid>newnode.data.sid)
        {
            if(root.left==null)
                root.left = newnode;
            else
                insert(root.left,newnode);


        }
        if(root.data.sid<newnode.data.sid)
        {
            if(root.right==null)
                 root.right= newnode;
            else
                insert(root.right,newnode);


        }
        return root;



    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args)
    {
        Node obj=insert(null,new Node(new student(11,"Ankur")));
        insert(obj,new Node(new student(12,"Prashant")));
        insert(obj,new Node(new student(13,"Rajiv")));
        insert(obj,new Node(new student(14,"Vinayak")));
        insert(obj,new Node(new student(15,"Vandna")));
        insert(obj,new Node(new student(16,"Etka")));
        insert(obj,new Node(new student(17,"Chhavi")));
        insert(obj,new Node(new student(18,"Richa")));
        inorder(obj);

    }

}
