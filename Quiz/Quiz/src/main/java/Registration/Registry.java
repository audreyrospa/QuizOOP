/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration;

/**
 *
 * @author audrey
 */
public class Registry implements Selection{
    String nik;
    String name;
    double WritingScore;
    double CodingScore;
    double InterviewScore;

    public Registry(String nik, String name, double WritingScore, double CodingScore, double InterviewScore) {
        this.nik = nik;
        this.name = name;
        this.WritingScore = WritingScore;
        this.CodingScore = CodingScore;
        this.InterviewScore = InterviewScore;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWritingScore() {
        return WritingScore;
    }

    public void setWritingScore(double WritingScore) {
        this.WritingScore = WritingScore;
    }

    public double getCodingScore() {
        return CodingScore;
    }

    public void setCodingScore(double CodingScore) {
        this.CodingScore = CodingScore;
    }

    public double getInterviewScore() {
        return InterviewScore;
    }

    public void setInterviewScore(double InterviewScore) {
        this.InterviewScore = InterviewScore;
    }

    @Override
    public double selectionWrite() {
        return 0;
    }

    @Override
    public double selectionCoding() {
        return 0;
    }

    @Override
    public double selectionInterview() {
        return 0;
    }

}
