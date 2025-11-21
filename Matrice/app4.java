//import 
import java.util.Arrays;
import java.util.Scanner;


public class app4{
		static Scanner input=new Scanner(System.in);
	//Lecture
	public static int Lecture(){
		int n;
		do{
			System.out.println("N=?");
			n=input.nextInt();
		}while(n<=0);
		return n;
	}
	//Remplir Matrice
	public static int[][] RemplirMar(int nl,int nc){
		int[][] M = new int[nl][nc];
		for(int i=0;i<nl;i++){
			for(int j=0;j<nc;j++){
				System.out.println("M[" + i + "][" + j + "] = ?");
				M[i][j]=input.nextInt();
			}
		}
		return M;
	}
	//Recherche
	public static boolean  Rechercher(int x,int nl,int nc, int[][]M){
		boolean verif=false;
				for(int i=0;i<nl;i++){
					for(int j=0;j<nc;j++){
						if(M[i][j]==x){
							verif=true;
							break;
						}}}
			return verif;
			}


	//PP
	public static void main(String[] args){
		int nl=Lecture();
		int nc=Lecture();
		int [][]M=RemplirMar(nl,nc);
		System.out.println("X=?");
		int x=input.nextInt();
		System.out.println("X Est existe?"+Rechercher(x,nl,nc,M));
	}
}