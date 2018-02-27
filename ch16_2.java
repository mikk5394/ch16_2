package ch16;

import ch16.LinkedIntList;

/*
Write a method called max that returns the maximum value in a list of integers. If the list is empty, it should throw a
NoSuchElementException.
 */
public class ch16_2 {
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(50);
        liste.add(15);
        liste.add(10);
        liste.add(20);

        System.out.println(liste.biggest());
    }

    /*
    kaldte metode:

    public int smallest (){

        // sætter metoden til at smide en exception hvis listen er tom.
        if (front == null) {
            throw new NoSuchElementException();
        } else {

            ListNode current = front;
            int min = front.data;

            //simpelt loop som tjekker om den næste nodes data er større end den nuværende største (som er gemt i min).
            while (current != null){
                if (current.data > min) {
                    min = current.data;
                }
                current = current.next;
            }
            return min;
        }
    }
     */
}
