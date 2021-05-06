package br.upe.ProjetoPOO.DAO;

import java.util.List;
import br.upe.ProjetoPOO.Classes.Morador;

public interface MoradorDAO {
	
	void salva(Morador m);
	Morador obterPorId(int id);
	Morador obterPorCpf(String cpf);
	void remove(int id);
	List<Morador> lista();
}
