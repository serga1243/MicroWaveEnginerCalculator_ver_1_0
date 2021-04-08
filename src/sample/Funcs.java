package sample;

public class Funcs {
    public static double[] calculate(double[] data, String opp_type) {
        double[] ans = new double[2];

        switch (opp_type) {

            // ----------------------------------------------------
            // ------- LOG -> LINEAR VOLTAGE ----------------------
            // ----------------------------------------------------

            case "dBmkV_to_Volts":
                ans[0] = toPow(new double[]{data[0], 120d, 20d});
                break;
            case "Volts_to_dBmkV":
                ans[0] = toLog10(new double[]{20d, data[0], 120d});
                break;
            case "dBV_to_Volts":
                ans[0] = toPow(new double[]{data[0], 0d, 20d});
                break;
            case "Volts_to_dBV":
                ans[0] = toLog10(new double[]{20d, data[0], 0d});
                break;
            case "dBV_to_dBmkV":
                ans[0] = data[0] + 120d;
                break;
            case "dBmkV_to_dBV":
                ans[0] = data[0] - 120d;
                break;

            // ----------------------------------------------------
            // ------- LOG -> LINEAR CURRENT ----------------------
            // ----------------------------------------------------

            case "dBmkA_to_mkA":
                ans[0] = toPow(new double[]{data[0], 0d, 20d});
                break;
            case "mkA_to_dBmkA":
                ans[0] = toLog10(new double[]{20d, data[0], 0d});
                break;
            case "dBA_to_A":
                ans[0] = toPow(new double[]{data[0], 0d, 20d});
                break;
            case "A_to_dBA":
                ans[0] = toLog10(new double[]{20d, data[0], 0d});
                break;
            case "dBA_to_dBmkA":
                ans[0] = data[0] + 120;
                break;
            case "dBmkA_to_dBA":
                ans[0] = data[0] - 120;
                break;

            // ----------------------------------------------------
            // ------- LOG -> LINEAR POWER ------------------------
            // ----------------------------------------------------

            case "dBm_to_Watts":
                ans[0] = toPow(new double[]{data[0], 30d, 10d});
                break;
            case "Watts_to_dBm":
                ans[0] = toLog10(new double[]{10d, data[0], 30});
                break;
            case "dBW_to_Watts":
                ans[0] = toPow(new double[]{data[0], 0d, 10d});
                break;
            case "Watts_to_dBW":
                ans[0] = toLog10(new double[]{10d, data[0], 0d});
                break;
            case "dBW_to_dBm":
                ans[0] = data[0] + 30;
                break;
            case "dBm_to_dBW":
                ans[0] = data[0] - 30;
                break;

            // ----------------------------------------------------
            // ------- TERM CONVERSIONS ---------------------------
            // ----------------------------------------------------

            case "dBm_to_dBmkV":
                ans[0] = data[0] + toLog10(new double[]{10d, data[1], 90d});
                break;
            case "dBmkV_to_dBm":
                ans[0] = data[0] - toLog10(new double[]{10d, data[1], -90d});
                break;
            case "dBm_to_dBmkA":
                ans[0] = data[0] - toLog10(new double[]{10d, data[1], 90d});
                break;
            case "dBmkA_to_dBm":
                ans[0] = data[0] + toLog10(new double[]{10d, data[1], -90d});
                break;
            case "dBmkA_to_dBmkV":
                ans[0] = data[0] + toLog10(new double[]{20d, data[1], 0d});
                break;
            case "dBmkV_to_dBmkA":
                ans[0] = data[0] + toLog10(new double[]{-20d, data[1], 0d});
                break;

            // ----------------------------------------------------
            // -------FIELD STRENGTH & POWER DENSITY --------------
            // ----------------------------------------------------

            case "dBmkV/m_to_V/m":
                ans[0] = toPow(new double[]{data[0], 120d, 20d});
                break;
            case "V/m_to_dBmkV/m":
                ans[0] = toLog10(new double[]{20d, data[0], 120d});
                break;
            case "dBmkV/m_to_dBmW/m^2":
                ans[0] = data[0] - 115.8d;
                break;
            case "dBmW/m^2_to_dBmkV/m":
                ans[0] = data[0] + 115.8d;
                break;
            case "dBmkV/m_to_dBmkA/m":
                ans[0] = data[0] - 51.5d;
                break;
            case "dBmkA/m_to_dBmkV/m":
                ans[0] = data[0] + 51.5;
                break;
            case "dBmkA/m_to_dBpT":
                ans[0] = data[0] + 2d;
                break;
            case "dBpT_to_dBmkA/m":
                ans[0] = data[0] - 2d;
                break;
            case "W/m^2_to_V/m":
                ans[0] = Math.sqrt(Math.pow(data[0], 2) * 377d);
                break;
            case "V/m_to_W/m^2":
                ans[0] = Math.pow(data[0], 2) / 377d;
                break;
            case "mkT_to_A/m":
                ans[0] = data[0] / 1.25d;
                break;
            case "A/m_to_mkT":
                ans[0] = data[0] * 1.25d;
                break;

            // ----------------------------------------------------
            // ------- E-FIELD ANTENNAS ---------------------------
            // ----------------------------------------------------

            case "Correction_Factor_0":
                ans[0] = data[0] + data[1];
                break;
            case "Field_Strength":
                ans[0] = Math.sqrt(30d * data[0] * data[1]) / data[2];
                break;
            case "Required_Power":
                ans[0] = Math.pow(data[0] * data[1], 2) / 30d / data[2];
                break;

            // ----------------------------------------------------
            // ------- LOOP ANTENNAS ------------------------------
            // ----------------------------------------------------

            case "Correction_Factor_1":
                ans[0] = data[0] + data[1];
                break;
            case "Assumed_E-field_for_shields_loops_0":
                ans[0] = data[0] + 51.5d;
                break;

            case "Assumed_E-field_for_shields_loops_1":
                ans[0] = data[0] + data[1];
                break;

            // ----------------------------------------------------
            // ------- CURRENT PROBES -----------------------------
            // ----------------------------------------------------

            case "Correction_Factor_2":
                ans[0] = data[0] - data[1];
                break;
            case "Power_needed":
                ans[0] = toPow(new double[]{data[0], -(toLog10(new double[]{10d, Math.pow(data[1], 2) / 50d, 0d})), 10d});
                break;

            // ----------------------------------------------------
            // ------- RETURN LOSS TO VSWR ------------------------
            // ----------------------------------------------------

            case "Г_0":
                ans[0] = toPow(new double[]{-(data[0]), 0d, 20d});
                break;
            case "VSWR_0":
                ans[0] = (1d + toPow(new double[]{-(data[0]), 0d, 20d})) / (1d - toPow(new double[]{-(data[0]), 0d, 20d}));
                break;
            case "VSWR_1":
                ans[0] = (1d + Math.abs(data[0])) / (1d - Math.abs(data[0]));
                break;
            case "Mismatch_Loss":
                ans[0] = toLog10(new double[]{10d, 1d - Math.pow(data[0], 2), 0d});
                break;
            case "Reflected_Power":
                ans[0] = 100d * Math.pow(data[0], 2);
                break;
            case "Return_Loss_0":
                ans[0] = -(toLog10(new double[]{20d, Math.abs(data[0]), 0d}));
                break;
            case "Return_Loss_1":
                ans[0] = -(toLog10(new double[]{20d, (data[0] - 1d) / (data[0] + 1d), 0d}));
                break;
            case "Г_1":
                ans[0] = (data[0] - 1d) / (data[0] + 1d);
                break;
            case "Through_Power":
                ans[0] = 100d * (1d - Math.pow(data[0], 2));
                break;

            // ----------------------------------------------------
            // ------- DEFAULT ------------------------------------
            // ----------------------------------------------------
            default:
                ans[0] = 0d;
                ans[1] = 0d;
                break;
        }

        return ans;
    }

    private static double toPow(double[] args) {
        return Math.pow(10d, (args[0] - args[1]) / args[2]);
    }

    private static double toLog10(double[] args) {
        return args[0] * Math.log10(args[1]) + args[2];
    }
}
