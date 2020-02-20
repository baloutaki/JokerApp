package be.ehb.jokerapp.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class JokeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Joke>> jokes;

    public MutableLiveData<ArrayList<Joke>> getJokes() {
        if (jokes == null){
            jokes = new MutableLiveData<>();
            loadJokes();
    }
        return jokes;


}

    //in het echt komt dit uit een backend database
    private void loadJokes() {
        ArrayList<Joke> newJokes = new ArrayList<>();

        newJokes.add(new Joke ("Het is blauw en weegt niet veel", "lichtblauw"));
        newJokes.add(new Joke ("het is zwart en als het uit den boom valt is uw kachel kapot", "uw kachel"));

        jokes.setValue(newJokes);


    }
}
