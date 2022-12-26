import java.io.*;

// 九九表示クラス
class MultiplicationTable {
    // 九九表を表示
    public void DispTable() {
        // 表示例
        System.out.printf("%3d %3d %3d", 1, 2, 3);

        System.out.print("\r\n");
    }
    // 九九表の指定の行を表示
    public void DispTable(int row) {
        // 表示例
        System.out.printf("%3d %3d %3d", 1, 2, 3);

        System.out.print("\r\n");
    }
}

// 簡易電卓クラス
class Calc {

    // 任意の計算式を表示
    public void DispCalc(String[] input) {
        for (String str: input) {
            //System.out.print(str);
        }

        //System.out.print("\r\n");
    }


}

// CSVデータクラス
class CsvData {

    // コンストラクタ
    public CsvData() {
        // 下記のコードで”Data.csv”ファイルの内容を読み込んでいます。
        // これを書き換えて動作に必要なデータに格納してください。
        BufferedReader br = null;
        try {
            File csv = new File("Data.csv");
            br = new BufferedReader(new FileReader(csv));
            String line;
            while((line = br.readLine()) != null) {
                //System.out.print(line);
                //System.out.print("\r\n");
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
            }
            catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    // データ表示
    public void DispData(String no) {
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        MultiplicationTable mt = new MultiplicationTable();
        Calc cl = new Calc();
        CsvData csv = new CsvData();

        // 問題１：MultiplicationTableクラスのDispTableメソッド（２種）を
        //        九九の表、任意の行表示を行うように実装する。
        mt.DispTable();
        mt.DispTable(3);

        // 問題２：CalcクラスのDispCalcメソッドで下記の式の回答を出力するようにする。
        String Calc2 = "1 + 1 =";
        cl.DispCalc(Calc2.split(" "));
        // 出力例）　1 + 1 = 2

        // 問題３：CalcクラスのDispCalcメソッドで下記の式の回答を出力するようにする。
        String Calc3 = "2 * 4 =";
        cl.DispCalc(Calc3.split(" "));
        // 出力例）　2 * 4 = 8

        // 問題４：CalcクラスのDispCalcメソッドで下記の式の回答を出力するようにする。
        String Calc4 = "1 + 2 * 3 =";
        cl.DispCalc(Calc4.split(" "));
        // 出力例）　1 + 2 * 3 = 7 (演算子の演算順序を考慮する)

        // 問題５：CalcクラスのDispCalcメソッドで下記の式の回答を出力するようにする。
        String Calc5 = "( 1 + 2 ) * 3 =";
        cl.DispCalc(Calc5.split(" "));
        // 出力例）　( 1 + 2 ) * 3 = 9 (括弧、演算子の演算順序を考慮する)

        // 問題６：CalcクラスのDispCalcメソッドで下記の式の回答を出力するようにする。
        String Calc6 = "( 1 + 2 ) * ( 3 + 4 * ( 5 + 6 ) + 7 - 8 )  =";
        cl.DispCalc(Calc6.split(" "));
        // 出力例）　( 1 + 2 ) * (3 + 4 * (5 + 6) + 7 - 8) = 138 (括弧、演算子の演算順序を考慮する)

        // 問題７：CSsvDataクラスにDispDataメソッドを実装してコンストラクタで読み込んだCSVの先頭列に合致した
        // データを下記のフォーマットで表示する。
        // 例：添付の「データファイル.txt」を読み込み、入力したコードの情報を表示せよ。
        // 例）csv.DispData("000001");の場合
        // ----------------------------------
        // 番号：000001
        // 種別：1
        // 名前：シャーロックホームズ
        // 価格：3000円
        // 発売日：2010年04月01日
        // ----------------------------------
        }
}
