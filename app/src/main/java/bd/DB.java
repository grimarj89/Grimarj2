package bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Gustavo on 16/09/2014.
 */
public class DB extends SQLiteOpenHelper{



    protected static final String Name_DB = "grimarj_db";
    protected static final int version_db = 1;
    private static final String createTableVerbos = "CREATE TABLE if not exists verbos (idVerbo INTEGER autoincrement NOT NULL," +
                                                                            "infinitive VARCHAR(20) NOT NULL," +
                                                                            "past VARCHAR(20) NOT NULL," +
                                                                            "participle VARCHAR(20) NOT NULL," +
                                                                            "spanish VARCHAR(20) NOT NULL," +
                                                                            "tipo VARCHAR(20) NOT NULL" +
                                                                            ")";

    public DB(Context context) {

        super(context, Name_DB, null, version_db);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(createTableVerbos);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
