import java.util.*;
import java.io.*;

class Node{
  Node left;
  Node right;
  int data;
  
  Node(int data){
    this.data = data;
    left = null;
    right= null;
  }
  
}

class Solution{
  public static void preOrder(Node root){
    if(root==null) return;
    System.out.print(root.data+" "); // 1. root 출력
    preOrder(root.left); // 2. left 확인
    preOrder(root.right); // 3. right 확인
      
  }

  public static Node insert(Node root, int data){
    if(root==null){
      return new Node(data);
    }
    else{
      Node cur;
      if(data <= root.data){
        cur = insert(root.left, data);
        root.left = cur;
      }
      else{
        cur = insert(root.right,data);
        root.right =cur;
      }
      return root;
    }
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    Node root = null;
    while(t-- > 0){
      int data = scan.nextInt();
      root = insert(root,data); //트리 쌓기
    }
    scan.close();
    preOrder(root); // inference
  }
}