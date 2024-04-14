import java.util.ArrayList;

public class GenericCollectionsExample {

    public static class Mahasiswa<NimT, NamaT, JurusanT> {

        private NimT nim;
        private NamaT nama;
        private JurusanT jurusan;

        public Mahasiswa(NimT nim, NamaT nama, JurusanT jurusan) {
            this.nim = nim;
            this.nama = nama;
            this.jurusan = jurusan;
        }

        public void setNim(NimT nim) {
            this.nim = nim;
        }

        public void setNama(NamaT nama) {
            this.nama = nama;
        }

        public void setJurusan(JurusanT jurusan) {
            this.jurusan = jurusan;
        }

        public NimT getNim() {
            return nim;
        }

        public NamaT getNama() {
            return nama;
        }

        public JurusanT getJurusan() {
            return jurusan;
        }

        @Override
        public String toString() {
            return "Mahasiswa{" +
                    "nim='" + nim + '\'' +
                    ", nama='" + nama + '\'' +
                    ", jurusan='" + jurusan + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        // ArrayList example
        ArrayList<Mahasiswa<String, String, String>> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa<>("123456", "Arthur", "Computer Science"));
        mahasiswaList.add(new Mahasiswa<>("654321", "angel", "Mathematics"));

        // Add new student with specified information
        mahasiswaList.add(new Mahasiswa<>("20220040267", "Moch Sandy Wijaya", "Teknik Informatika"));

        System.out.println("ArrayList of Mahasiswa:");
        for (Mahasiswa<String, String, String> mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }
    }
}
