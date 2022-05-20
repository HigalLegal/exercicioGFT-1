package model.entities;

import java.util.List;

public abstract class Personagem {

	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;

	// ----------------------------------------------------

	public Personagem() {
	}

	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
	}

	// ----------------------------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public float getXp() {
		return xp;
	}

	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	// ----------------------------------------------------

	public abstract void levelUp();

	public abstract int attack();

	@Override
	public String toString() {
		return "Nome: " + nome + " || Vida: " + vida + " || Mana: " + mana + " || XP: " + xp + "  || Inteligência: "
				+ inteligencia + " || Força: " + forca + " Level: " + level;
	}
	
	// ----------------------------------------------------
	
	public static class TotalPersonagens {
		
		public static int total(List<?> lista) {
			return lista.size();
		}
		
	}
	
	/*
	 * Não entendi bem a segunda parte desta questão (a terceira), mas pelo que li é pra usar uma
	 * classe interna estática para calcular a quantidade de personagens criadas no jogo.
	 * 
	 * */

}
