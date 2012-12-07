/**
 * Copyright (C) 2009 - 2012 SC 4ViewSoft SRL
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.achartengine.renderer;

import java.io.Serializable;

import android.graphics.Color;
import android.graphics.Paint.Align;

/**
 * A simple series renderer.
 */
public class SimpleSeriesRenderer implements Serializable {
	/** The chart values spacing from the data point. */
	private float mChartValuesSpacing = 5f;
	/** The chart values text alignment. */
	private Align mChartValuesTextAlign = Align.CENTER;
	/** The chart values text color. */
	private int mChartValuesTextColor = Color.BLUE;
	/** The chart values text size. */
	private float mChartValuesTextSize = 10;
	/** The series color. */
	private int mColor = Color.BLUE;
	/** If the values should be displayed above the chart points. */
	private boolean mDisplayChartValues;
	/** The minimum distance between displaying chart values. */
	private int mDisplayChartValuesDistance = 100;
	/** If gradient is enabled. */
	private boolean mGradientEnabled = false;
	/** The gradient start color. */
	private int mGradientStartColor;
	/** The gradient start value. */
	private double mGradientStartValue;
	/** The gradient stop color. */
	private int mGradientStopColor;
	/** The gradient stop value. */
	private double mGradientStopValue;
	/** The stroke style. */
	private BasicStroke mStroke;

	/**
	 * Returns the chart values spacing from the data point.
	 * 
	 * @return the chart values spacing
	 */
	public float getChartValuesSpacing() {
		return mChartValuesSpacing;
	}

	/**
	 * Returns the chart values text align.
	 * 
	 * @return the chart values text align
	 */
	public Align getChartValuesTextAlign() {
		return mChartValuesTextAlign;
	}

	/**
	 * Returns the chart values text color.
	 * 
	 * @return the chart values text color
	 */
	public int getChartValuesTextColor() {
		return mChartValuesTextColor;
	}

	/**
	 * Returns the chart values text size.
	 * 
	 * @return the chart values text size
	 */
	public float getChartValuesTextSize() {
		return mChartValuesTextSize;
	}

	/**
	 * Returns the series color.
	 * 
	 * @return the series color
	 */
	public int getColor() {
		return mColor;
	}

	/**
	 * Returns the chart values minimum distance.
	 * 
	 * @return the chart values minimum distance
	 */
	public int getDisplayChartValuesDistance() {
		return mDisplayChartValuesDistance;
	}

	/**
	 * Returns the gradient start color.
	 * 
	 * @return the gradient start color
	 */
	public int getGradientStartColor() {
		return mGradientStartColor;
	}

	/**
	 * Returns the gradient start value.
	 * 
	 * @return the gradient start value
	 */
	public double getGradientStartValue() {
		return mGradientStartValue;
	}

	/**
	 * Returns the gradient stop color.
	 * 
	 * @return the gradient stop color
	 */
	public int getGradientStopColor() {
		return mGradientStopColor;
	}

	/**
	 * Returns the gradient stop value.
	 * 
	 * @return the gradient stop value
	 */
	public double getGradientStopValue() {
		return mGradientStopValue;
	}

	/**
	 * Returns the stroke style.
	 * 
	 * @return the stroke style
	 */
	public BasicStroke getStroke() {
		return mStroke;
	}

	/**
	 * Returns if the chart point values should be displayed as text.
	 * 
	 * @return if the chart point values should be displayed as text
	 */
	public boolean isDisplayChartValues() {
		return mDisplayChartValues;
	}

	/**
	 * Returns the gradient is enabled value.
	 * 
	 * @return the gradient enabled
	 */
	public boolean isGradientEnabled() {
		return mGradientEnabled;
	}

	/**
	 * Sets the chart values spacing from the data point.
	 * 
	 * @param spacing
	 *            the chart values spacing (in pixels) from the chart data point
	 */
	public void setChartValuesSpacing(float spacing) {
		mChartValuesSpacing = spacing;
	}

	/**
	 * Sets the chart values text align.
	 * 
	 * @param align
	 *            the chart values text align
	 */
	public void setChartValuesTextAlign(Align align) {
		mChartValuesTextAlign = align;
	}

	/**
	 * Sets the chart values text color.
	 * 
	 * @param align
	 *            the chart values text color
	 */
	public void setChartValuesTextColor(int color) {
		mChartValuesTextColor = color;
	}

	/**
	 * Sets the chart values text size.
	 * 
	 * @param textSize
	 *            the chart values text size
	 */
	public void setChartValuesTextSize(float textSize) {
		mChartValuesTextSize = textSize;
	}

	/**
	 * Sets the series color.
	 * 
	 * @param color
	 *            the series color
	 */
	public void setColor(int color) {
		mColor = color;
	}

	/**
	 * Sets if the chart point values should be displayed as text.
	 * 
	 * @param display
	 *            if the chart point values should be displayed as text
	 */
	public void setDisplayChartValues(boolean display) {
		mDisplayChartValues = display;
	}

	/**
	 * Sets chart values minimum distance.
	 * 
	 * @param distance
	 *            the chart values minimum distance
	 */
	public void setDisplayChartValuesDistance(int distance) {
		mDisplayChartValuesDistance = distance;
	}

	/**
	 * Sets the gradient enabled value.
	 * 
	 * @param enabled
	 *            the gradient enabled
	 */
	public void setGradientEnabled(boolean enabled) {
		mGradientEnabled = enabled;
	}

	/**
	 * Sets the gradient start value and color.
	 * 
	 * @param start
	 *            the gradient start value
	 * @param color
	 *            the gradient start color
	 */
	public void setGradientStart(double start, int color) {
		mGradientStartValue = start;
		mGradientStartColor = color;
	}

	/**
	 * Sets the gradient stop value and color.
	 * 
	 * @param start
	 *            the gradient stop value
	 * @param color
	 *            the gradient stop color
	 */
	public void setGradientStop(double start, int color) {
		mGradientStopValue = start;
		mGradientStopColor = color;
	}

	/**
	 * Sets the stroke style.
	 * 
	 * @param stroke
	 *            the stroke style
	 */
	public void setStroke(BasicStroke stroke) {
		mStroke = stroke;
	}

}
