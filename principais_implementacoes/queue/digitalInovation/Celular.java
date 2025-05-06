package principais_implementacoes.queue.digitalInovation;

import java.util.Objects;

public class Celular {


        private String marca;


        public Celular(String marca) {
            this.marca = marca;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Celular celular = (Celular) object;
            return Objects.equals(marca, celular.marca);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(marca);
        }

        @Override
        public String
        toString() {
            return "Celular{" +
                    "marca='" + marca + '\'' +
                    '}';
        }
    }



