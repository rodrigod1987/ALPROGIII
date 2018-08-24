public class BuscaLinear<T> {
    public T buscaLinear(T[] dados, T chave){
        for (int i = 0; i < dados.length; i++){
            if (dados[i].equals(chave))
                return dados[i];
        }
        return null;
    }
}