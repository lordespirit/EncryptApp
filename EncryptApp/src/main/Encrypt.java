package main;

public class Encrypt {
	
	private String alfabeto;
	private int patron;
	
	public Encrypt(){
		this.alfabeto = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		this.patron = Integer.MAX_VALUE;
	}
	
	public Encrypt(int patron){
		this.alfabeto = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		this.patron = patron;
	}
	
	public String[] decode(String word){
		
		if(patron==Integer.MAX_VALUE){
			String[] frasesPosibles = new String[26];
			char[] wordToChar = word.toUpperCase().toCharArray();
			char[] wordDecoded = new char[wordToChar.length];
			// BUCLE POR TODO EL ALFABETO, TODOS LOS PATRONES
			for(int i=0;i<alfabeto.toCharArray().length;i++){
				
				int j=0;
				for(char ch: wordToChar){
					int alfabetIndex  = new String(alfabeto).indexOf(ch);
					int control = i;
					while(control>0){
						alfabetIndex--;
						if(alfabetIndex<0){
							alfabetIndex = 25;
						}
						control--;
					}
					if(ch==' '){
						wordDecoded[j++]=' ';
					}else{
						wordDecoded[j++]=alfabeto.toCharArray()[alfabetIndex];
					}
				}
				frasesPosibles[i]=new String(wordDecoded);
				
			}
			
			return frasesPosibles;
			
		}else{
			String[] solucion = new String[1];
			char[] wordToChar = word.toUpperCase().toCharArray();
			char[] wordDecoded = new char[wordToChar.length];
	
			int i=0;
			for(char ch: wordToChar){
				int alfabetIndex  = new String(alfabeto).indexOf(ch);
				int control = patron;
				while(control>0){
					alfabetIndex--;
					if(alfabetIndex<0){
						alfabetIndex = 25;
					}
					control--;
				}
				if(ch==' '){
					wordDecoded[i++]=' ';
				}else{
					wordDecoded[i++]=alfabeto.toCharArray()[alfabetIndex];
				}
			}
			solucion[0] = new String(wordDecoded);
			return solucion;
		}
	}
	
	public String encode(String word){
		
		char[] wordToChar = word.toUpperCase().toCharArray();
		char[] wordEncoded = new char[wordToChar.length];

		int i=0;
		for(char ch: wordToChar){
				int alfabetIndex  = new String(alfabeto).indexOf(ch);
				int control = patron;
				while(control>0){
					alfabetIndex++;
					if(alfabetIndex==26){
						alfabetIndex = 0;
					}
					control--;
				}
				if(ch==' '){
					wordEncoded[i++]=' ';
				}else{
					wordEncoded[i++]=alfabeto.toCharArray()[alfabetIndex];
				}
		}
		return new String(wordEncoded);
	}
	
	

}
