public class Main {
    public static void main(String[] args) {

        KrediUI krediUI = new KrediUI();

        krediUI.krediHesapla(new OgretmenKrediManeger());
        krediUI.krediHesapla(new TarimKrediManager());
        krediUI.krediHesapla(new AskerKrediManager());


    }
}