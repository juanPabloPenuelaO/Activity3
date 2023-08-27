package arrays;

public class ServicioCelular {
    Cliente cliente;

    private String nunerocelular;

    public ServicioCelular(Cliente cliente, String nunerocelular) {
        this.cliente = cliente;
        this.nunerocelular = nunerocelular;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNunerocelular() {
        return nunerocelular;
    }

    public void setNunerocelular(String nunerocelular) {
        this.nunerocelular = nunerocelular;
    }

    @Override
    public String toString() {
        return "ServicioCelular{" +
                "cliente=" + cliente +
                ", nunerocelular='" + nunerocelular + '\'' +
                '}';
    }
}

