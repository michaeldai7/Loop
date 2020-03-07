
import java.util.*;
class Twelve {
public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
int maxrow=9;
int p=1;
int n,k,nk;
int nfact, kfact,nkfact;
int maxnk;
int term;
for (int row=0;row<=maxrow; row++){
	for(int col=0; col<=row;col++){
		n=row;
		p=1;
		for (int x=1;x<=row;x++){
		  p=p*n;
		  n=n-1;
    }
    nfact=p;
    p=1;
	  k=col;
		for (int x=1;x<=col;x++){
		  p=p*k;
		  k=k-1;
		}
	  kfact=p;
		p=1;
		nk=row-col;
		maxnk=nk;
		for (int x=1;x<=maxnk;x++){
		  p=p*nk;
		  nk=nk-1;
    }
		nkfact=p;		
		term=nfact/(kfact*nkfact);
		System.out.print(term+" ");
  }
}
}
}