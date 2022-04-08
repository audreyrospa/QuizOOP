/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration;

/**
 *
 * @author audrey
 */
public class Web extends Registry implements Selection {

     public Web(String nik, String name, double WritingScore, double CodingScore,double InterviewScore) {
        super(nik, name, WritingScore, CodingScore, InterviewScore);
    }

    
    @Override
    public double selectionWrite() {
        return (double) (this.WritingScore * 0.4);
    }

    @Override
    public double selectionCoding() {
        return (double) (this.CodingScore * 0.35);
    }

    @Override
    public double selectionInterview() {
        return (float) (this.InterviewScore * 0.25);
    }

    double WritingScore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double CodingScore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double InterviewScore() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
