import java.util.Scanner;
public class App01{
	static Scanner clavier = new Scanner(System.in);
	//Lecture
	public static int lecture(){
		int x;
		do{
			System.out.println("x=?");
			x=clavier.nextInt();
			
		}while(x<=0);
		return x;
	}
	//Remplir_tab
	public static int[] Remplir_Tap(int x){
		int[] T=new int[x];
		int i;
		for(i=0;i<x;i++){
			System.out.println("SaisirT["+i+"]=");
			T[i]=lecture();
		}
		return T;
	}
	public static int[] SommeTab(int n1,int n2,int[]T1,int[]T2){
		int[] T3;
		if(n1>n2){
			T3=new int[n1];
			for(int i=0;i<n2;i++){
				T3[i]=T1[i]+T2[i];
			}
			for(int i=n2;i<n1;i++){
				T3[i]=T1[i];
		}else{
			T3=new int[n2];
			for(int i=0;i<n1;i++){
				T3[i]=T1[i]+T2[i];
			}
			for(int i=n1;i<n2;i++){
				T3[i]=T2[i]; 
			}
		}
		return T3;
		
	}
	public static void AfficheTab(int[] tab){

        for(int i = 0; i < tab.length; i++){
            System.out.println("tab["+i+"]="+tab[i]);
        }
    }
	public static void main(String[] args){
		int i;
		int n1=lecture();
		int n2=lecture();
		int[] T1=Remplir_Tap(n1);
		int[] T2=Remplir_Tap(n2);
		int[] T3=SommeTab(n1,n2,T1,T2);
		AfficheTab(T3);
	}
}