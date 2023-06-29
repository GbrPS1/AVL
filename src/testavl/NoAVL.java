/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testavl;

/**
 *
 * @author icalc
 */
public class NoAVL {
	private Object dado;            //Dado do nó
	private NoAVL pai;		//Pai do nó
	private NoAVL esq;		//Filho Esquerdo
	private NoAVL dir;		//Filho Direito
	private int fb;			//Fator de Balanceamento
		
	public NoAVL(Object x, NoAVL p, NoAVL e, NoAVL d)	{
		dado = x;
		pai  = p;
		esq  = e;
		dir  = d;
                fb = 0;
	}
	
	public NoAVL() {
		this("",null,null,null);
	}
	
	public NoAVL(Object _dado) {
		this(_dado,null,null,null);
	}
	
	public Object getDado() {
		return dado;
	}
	
	public void setDado(Object _dado) {
		dado = _dado;
	}
	
	public NoAVL getPai() {
		return pai;
	}
	
	public void setPai(NoAVL _pai) {
		pai = _pai;
	}
	
	public NoAVL getEsq() {
		return esq;
	}
	
	public void setEsq(NoAVL _esq) {
		esq = _esq;
	}
	
	public NoAVL getDir() {
		return dir;
	}
	
	public void setDir(NoAVL _dir) {
		dir = _dir;
	}
	
	public void setFb(int _fb) {
		fb = _fb;
	}
	
	public int getFb() {
		return fb;
	}
	
}
