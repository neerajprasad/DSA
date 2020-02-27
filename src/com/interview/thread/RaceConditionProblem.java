package java.interview.thread;

public class RaceConditionProblem {
    public static void main(String[] args) {
    TicketBooking ticketBooking = new TicketBooking();
        SynchronizeTicketBooking synchronizeTicketBooking = new SynchronizeTicketBooking();
    new Thread(synchronizeTicketBooking,"first person").start();
    new Thread(synchronizeTicketBooking,"second person").start();

    }
}

/*
Booking ticket for first person
Booking ticket for second person
ticket booked for first person
ticket booked for second person
current count 0
current count -1

 */
class TicketBooking implements Runnable{
int ticketAvailable=1;
    @Override
    public void run() {
        System.out.println("Booking ticket for "+ Thread.currentThread().getName());
        if(ticketAvailable>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticketAvailable--;
            System.out.println("ticket booked for "+ Thread.currentThread().getName());
            System.out.println("current count "+ ticketAvailable);
        }else {
            System.out.println("Ticket not booked");
        }
    }
}

/*
Booking ticket for first person
Booking ticket for second person
ticket booked for first person
current count 0
Ticket not booked second person

 */
class SynchronizeTicketBooking implements Runnable{
    int ticketAvailable=1;
    @Override
    public void run() {
        System.out.println("Booking ticket for "+ Thread.currentThread().getName());
        synchronized (this) {
            if (ticketAvailable > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ticketAvailable--;
                System.out.println("ticket booked for " + Thread.currentThread().getName());
                System.out.println("current count " + ticketAvailable);
            } else {
                System.out.println("Ticket not booked " + Thread.currentThread().getName());
            }
        }
    }
}