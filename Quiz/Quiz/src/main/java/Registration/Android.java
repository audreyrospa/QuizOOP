/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registration;

/**
 *
 * @author audrey
 */
public class Android extends Registry implements Selection {
    
    public Android(String nik, String name, double WritingScore, double CodingScore, double InterviewScore) {
        super(nik, name, WritingScore, CodingScore, InterviewScore);
    }
    
    @Override
    public double selectionWrite() {
        return this.WritingScore * 0.2;
    }

    @Override
    public double selectionCoding() {
        return this.CodingScore * 0.5;
    }

    @Override
    public double selectionInterview() {
        return this.InterviewScore * 0.3;
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    
}
