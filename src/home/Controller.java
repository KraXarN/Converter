package home;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import java.io.*;

import javafx.scene.web.*;

public class Controller
{
    public ChoiceBox<String> cbVideoQuality, cbAudioQuality;
    public Label lFile;
    public TabPane tQuality;

    public WebView browser;

    public void OpenFile()
    {
        //addValues();

        FileChooser fileDialog = new FileChooser();
        fileDialog.setTitle("Select input file");
        fileDialog.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Video Files", "*.mp4;*.webm;*.ogv;*.wmv"),
                new FileChooser.ExtensionFilter("Audio Files", "*.flac;*.mp3;*.opus;*.ogg;*.wma;*.m4a"),
                new FileChooser.ExtensionFilter("All Files",   "*.*")
        );
        File file = fileDialog.showOpenDialog(Main.mainWindow);

        if (file != null)
            lFile.setText(file.getPath());
    }

    private void addValues()
    {
        if (cbVideoQuality.getItems().isEmpty())
        {
            cbVideoQuality.getItems().addAll(
                    "None",
                    "H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10",
                    "H.265 / HEVC (High Efficiency Video Coding)",
                    "Theora",
                    "On2 VP8",
                    "Google VP9",
                    "Windows Media Video 8"
            );
            cbVideoQuality.getSelectionModel().select(0);
        }
    }

    public void convert()
    {
        System.out.println("Selected quality tab: " + String.valueOf(tQuality.getSelectionModel().getSelectedIndex()));
        System.out.println("Selected video codec: " + String.valueOf(cbVideoQuality.getSelectionModel().getSelectedIndex() + " (" + cbVideoQuality.getSelectionModel().getSelectedItem() + ")"));
        System.out.println("Selected audio codec: " + String.valueOf(cbAudioQuality.getSelectionModel().getSelectedIndex() + " (" + cbAudioQuality.getSelectionModel().getSelectedItem() + ")"));
        System.out.println();
    }
}
