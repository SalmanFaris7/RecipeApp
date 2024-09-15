/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class LinkedList {

    private Link first;
    private Link temp;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        else
            return false;
    }
    
    public void insertFirst(int no,String d,int t,String i){
        if(isEmpty()){
            first = new Link(no, d, t, i);
            return;
        }
        temp = new Link(no, d, t, i);
        first.next = first;
        first = temp;
    }
    
    public void insertLast(int no, String d, int t, String i){
        if(isEmpty()){
            first = new Link(no, d, t, i);
            return;
        }
        temp = first;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Link(no, d, t, i);
    }
    
    public void insertAfter(int o,int no, String d, int t, String i){
        Link temp1=null;
        temp = first;
        if(isEmpty()){
            first = new Link(no, d, t, i);
            return;
        }
        
        while(temp.getRecipeNum() != o || temp.next != null){
            temp = temp.next;
        }
        if(temp.getRecipeNum() == o){
            temp1 = temp.next;  
            temp.next = new Link(no, d, t, i);
            temp.next.next = temp1;
        }
    }
    
    public Link deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        temp = first;
        first = first.next;
        return temp;

    }

    public String getPaths() {
        Link c = first;
        String path = "";
        while (c != null) {
            path += c.getImgPath() + "&&";
            c = c.next;
        }
        return path;

    }

    public Link find(int no) {
        temp = first;
        while (temp != null) {

            if (temp.getRecipeNum() == no) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Link delete(int no) {
        if (isEmpty()) {
            return null;
        }
        temp=first;
        Link temp1;
        if(first.getRecipeNum()==no){
            deleteFirst();
            return null;
        }
        while (first.getRecipeNum() != no && first != null) {
            temp = temp.next;
            if (temp.next.getRecipeNum() == no) {
                temp1 = first.next;
                temp.next = temp.next.next;
                return temp1;
            }
        }
        return null;
    }

}
