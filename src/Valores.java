
public class Valores implements ValoresITF {
	public static void main(String[] args) {}
	
	int inteiros[] = new int[10];

	@Override
	public boolean ins(int v) {
		int tamanho = this.size();
		
		if(v > 0) {
			if(tamanho < this.inteiros.length) {
				this.inteiros[tamanho] = v; 
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
		
	}

	@Override
	public int del(int i) {
		int tamanho = this.size();
		if(tamanho == 0) {
			return -1;
		}else {
			for(int y=0; y<this.inteiros.length; y++) {
				if(this.inteiros[y] == i) {
					this.inteiros[y] = 0;
					return 0;
				}
			}
		}
		return -1;
	}

	@Override
	public int size() {
		int item = 0;
	    for (int i = 0; i < this.inteiros.length; i++) {
	        if(this.inteiros[i] == 0) {
	        	break;
	        }else{
	        	item++;
	        }
	    }
	    return item;
	}

}
