import java.util.Scanner;
public class app1{
    public static int lecture(){
        Scanner input = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter positive : ");
            n=input.nextInt();
        }while(n<=0);        return n;
    }
    public static int[] RempliTab(int n,int[] tab){
        for(int i=0;i<n;i++){
            tab[i]=lecture();
        }
        return tab;
    }
    public static int[] SommeTab(int n1,int n2 ,int[] T1,int[] T2){
        int[] somme;
        if (n1>n2){
            somme=new int[n1];
            for(int i=0;i<n2;i++){
                somme[i]=T1[i]+T2[i];
            }
            for(int i=n2;i<n1;i++){
                somme[i]=T1[i];
            }
        }
        else{
            somme=new int[n2];
            for(int i=0;i<n1;i++){
                somme[i]=T1[i]+T2[i];
            }
            for(int i=n1;i<n2;i++){
                somme[i]=T2[i];
            }
        }
        return somme;
    }

    public static void AfficheTab(int[] tab){

        for(int i = 0; i < tab.length; i++){
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }

    public static void main(String[] args){
        int n1 = lecture();
        int n2 = lecture();
        int[] tab1 = new int[n1];
        int[] tab2 = new int[n2];
        int[] T1=RempliTab(n1,tab1);
        int[] T2=RempliTab(n2,tab2);
        int[] T3=SommeTab(n1,n2 ,T1,T2);
        AfficheTab(T3);
    }
}