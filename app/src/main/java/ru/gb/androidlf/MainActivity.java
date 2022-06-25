package ru.gb.androidlf;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton buttonOne;
    private MaterialButton buttonTwo;
    private MaterialButton buttonThree;
    private MaterialButton buttonFour;
    private MaterialButton buttonFive;
    private MaterialButton buttonSix;
    private MaterialButton buttonSeven;
    private MaterialButton buttonEight;
    private MaterialButton buttonNine;
    private MaterialButton buttonZero;

    private MaterialButton buttonPlus;
    private MaterialButton buttonMinus;
    private MaterialButton buttonMulti;
    private MaterialButton buttonDivision;

    private MaterialButton buttonPoint;
    private MaterialButton buttonDelete;
    private MaterialButton buttonResult;

    private EditText inputEditText;

    private ru.gb.androidlf.CalcInput input = new ru.gb.androidlf.CalcInput();
    private final String INPUT = "INPUT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonZero = findViewById(R.id.button_zero);

        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonMulti = findViewById(R.id.button_multi);
        buttonDivision = findViewById(R.id.button_division);

        buttonPoint = findViewById(R.id.button_point);
        buttonDelete = findViewById(R.id.button_delete);
        buttonResult = findViewById(R.id.button_result);

        inputEditText = findViewById(R.id.edit_text_input);


        buttonOne.setOnClickListener(v -> {
            input.inputFunction('1');
            inputEditText.setText(input.getTextResult());
        });

        buttonTwo.setOnClickListener(v -> {
            input.inputFunction('2');
            inputEditText.setText(input.getTextResult());
        });

        buttonThree.setOnClickListener(v -> {
            input.inputFunction('3');
            inputEditText.setText(input.getTextResult());
        });

        buttonFour.setOnClickListener(v -> {
            input.inputFunction('4');
            inputEditText.setText(input.getTextResult());
        });

        buttonFive.setOnClickListener(v -> {
            input.inputFunction('5');
            inputEditText.setText(input.getTextResult());
        });

        buttonSix.setOnClickListener(v -> {
            input.inputFunction('6');
            inputEditText.setText(input.getTextResult());
        });

        buttonSeven.setOnClickListener(v -> {
            input.inputFunction('7');
            inputEditText.setText(input.getTextResult());
        });

        buttonEight.setOnClickListener(v -> {
            input.inputFunction('8');
            inputEditText.setText(input.getTextResult());
        });

        buttonNine.setOnClickListener(v -> {
            input.inputFunction('9');
            inputEditText.setText(input.getTextResult());
        });

        buttonZero.setOnClickListener(v -> {
            if (!input.getInputNumber().equals("0")) input.inputFunction('0');
            inputEditText.setText(input.getTextResult());
        });

        buttonPoint.setOnClickListener(v -> {
            if (!input.getInputNumber().equals("")) input.inputFunction('.');
            inputEditText.setText(input.getTextResult());
        });

        buttonDelete.setOnClickListener(v -> {
            input.clearAll();
            inputEditText.setText(input.getTextResult());
        });

        buttonPlus.setOnClickListener(v -> {
            input.operationFunction('+');
            inputEditText.setText(input.getTextResult());
        });

        buttonMinus.setOnClickListener(v -> {
            input.operationFunction('-');
            inputEditText.setText(input.getTextResult());
        });

        buttonMulti.setOnClickListener(v -> {
            input.operationFunction('*');
            inputEditText.setText(input.getTextResult());
        });

        buttonDivision.setOnClickListener(v -> {
            input.operationFunction('/');
            inputEditText.setText(input.getTextResult());
        });

        buttonResult.setOnClickListener(v -> {
            if (input.getSign() != '0') {
                input.resultFunction();
                inputEditText.setText(input.getTextResult());
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putSerializable(INPUT, input);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        input = (ru.gb.androidlf.CalcInput)instanceState.getSerializable(INPUT);
        inputEditText.setText(input.getTextResult());
    }
}