package dna.com;

public class Proteine {

	
		 public static String Pro(String str) {
	
			 String[][]acideAmine ={{"ala","GCU","GCC","GCG","GCG","",""},{"arg","GGU","GCG","CGA","CGG","AGA","AGG"},{"asp","GAC","GAU","","","",""},
					 {"asn","AAC","AAU","","","",""},{"cys","UGC","UGU","","","",""},{"glu","GAA","GAG","","","",""},{"gln","CAA","CAG","","","",""},{"gly","GGU","GGA","GGG","GGC","",""},{"his","CAU","CAC","","","",""},
				{"ile","AUA","AUC","AUU","","",""}, {"leu","UUA","UUG","CUU","CUC","CUA","CUG"},{"lys","AAA","AAG","","","",""}, {"met","AUG","","","","",""},{"phe","UUU","UUC","","","",""},{"pro","CCU","CCC","CCA","CCG","",""},
				{"ser","UCU","UCC","UCA","UCG","AGU","AGC"},
			    {"thr","ACU","ACC","ACA","ACG","",""}, {"trp","UGC","","","","",""}, {"tyr","UAU","UAC","","","",""},{"val","GUA","GUC","GUG","GUU","",""},{"stop","UAG","UAA","UGA","","",""}};
			 
		   //tableau de chaînes
		 
		  
		  //la chaîne à traiter
		  
		 
		  // On découpe la chaîne "str" à traiter et on récupère le résultat dans le tableau "splitArray"
		  String[] splitArray = str.split("-");
		 

		  String builder = new String();
		  fafa:for(int i = 0; i< splitArray.length;i++){
			  String  str2 = splitArray[i];
			  System.out.println(str2);
		   for(int i1 = 0; i1<21;i1++){ 
				 for(int j = 0; j<7;j++) {
					 if(str2.equals(acideAmine[i1][j])){
						 
						 builder = builder.concat(acideAmine[i1][0]).concat("-");
						 continue fafa;
					 } 
				 }
			 } 
	
		 
		  }
		 
		  return builder;
		 }

		
}
