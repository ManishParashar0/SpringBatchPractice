package com.manish.SpringBatch.Modal;

public class AnnualSurvey {
	private int Year;
	private String Industry_aggregation_NZSIOC;
	private long Industry_code_NZSIOC;
	private String Industry_name_NZSIOC;

	public AnnualSurvey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnnualSurvey(int year, String industry_aggregation_NZSIOC, long industry_code_NZSIOC,
			String industry_name_NZSIOC) {
		super();
		Year = year;
		Industry_aggregation_NZSIOC = industry_aggregation_NZSIOC;
		Industry_code_NZSIOC = industry_code_NZSIOC;
		Industry_name_NZSIOC = industry_name_NZSIOC;
	}

	@Override
	public String toString() {
		return "AnnualSurvey [Year=" + Year + ", Industry_aggregation_NZSIOC=" + Industry_aggregation_NZSIOC
				+ ", Industry_code_NZSIOC=" + Industry_code_NZSIOC + ", Industry_name_NZSIOC=" + Industry_name_NZSIOC
				+ "]";
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getIndustry_aggregation_NZSIOC() {
		return Industry_aggregation_NZSIOC;
	}

	public void setIndustry_aggregation_NZSIOC(String industry_aggregation_NZSIOC) {
		Industry_aggregation_NZSIOC = industry_aggregation_NZSIOC;
	}

	public long getIndustry_code_NZSIOC() {
		return Industry_code_NZSIOC;
	}

	public void setIndustry_code_NZSIOC(long industry_code_NZSIOC) {
		Industry_code_NZSIOC = industry_code_NZSIOC;
	}

	public String getIndustry_name_NZSIOC() {
		return Industry_name_NZSIOC;
	}

	public void setIndustry_name_NZSIOC(String industry_name_NZSIOC) {
		Industry_name_NZSIOC = industry_name_NZSIOC;
	}
}
