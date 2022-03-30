package tarea;

public class T2 extends Tarea{

    public T2(){

    }
    @Override
    public void run() {
        while (true) {

            Tarea.y2 = Tarea.y1 + 1;

            Tarea.cantidad +=1;

            while ((!(Tarea.y1 == 0) && !(Tarea.y2 < Tarea.y1))) {
                try{
                    Thread.sleep(0);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (token) {
                Tarea.critical++;
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Tarea.critical--;
            }
            Tarea.y2 = 0;
            if (Tarea.critical<0 || Tarea.critical>1) {
                System.out.println("--------Valor CRITICAL desde T2 = " + (Tarea.critical));
                System.out.println("--------Valor Y1 desde T2 = " + (Tarea.y1));
                System.out.println("--------Valor Y2 desde T2 = " + (Tarea.y2));
                System.out.println("Cantidad-" + (Tarea.cantidad));
            }else if(Tarea.cantidad > 1000000){
                System.out.println("Cantidad-" + (Tarea.cantidad));
            }

        }
    }
}
