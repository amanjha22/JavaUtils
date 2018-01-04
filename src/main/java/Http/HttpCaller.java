package Http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HttpCaller {
    	/**
	 * @param url {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, HttpRequestMethod httpRequestMethod)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, null, null, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, HttpRequestMethod httpRequestMethod, long timeout,
			TimeUnit timeUnit) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, null, null, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params,
			HttpRequestMethod httpRequestMethod) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, null, null, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params,
			HttpRequestMethod httpRequestMethod, long timeout, TimeUnit timeUnit)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, null, null, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, HttpRequestMethod httpRequestMethod,
			Map<String, String> headers) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, null, headers, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, HttpRequestMethod httpRequestMethod,
			Map<String, String> headers, long timeout, TimeUnit timeUnit)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, null, headers, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params,
			HttpRequestMethod httpRequestMethod, Map<String, String> headers)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, null, headers, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody String
	 * @param httpRequestMethod the HTTP request method
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, String requestBody, HttpRequestMethod httpRequestMethod)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, requestBody, null, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody String
	 * @param httpRequestMethod the HTTP request method
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, String requestBody, HttpRequestMethod httpRequestMethod,
			long timeout, TimeUnit timeUnit) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, requestBody, null, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody String
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params, String requestBody,
			HttpRequestMethod httpRequestMethod) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, requestBody, null, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody String
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params, String requestBody,
			HttpRequestMethod httpRequestMethod, long timeout, TimeUnit timeUnit)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, requestBody, null, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody  {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, String requestBody, HttpRequestMethod httpRequestMethod,
			Map<String, String> headers) throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, requestBody, headers, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param requestBody {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, String requestBody, HttpRequestMethod httpRequestMethod,
			Map<String, String> headers, long timeout, TimeUnit timeUnit)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, null, httpRequestMethod, requestBody, headers, timeout, timeUnit);
	}

	/**
	 * @param url {@link String}
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param requestBody {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException  Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params, String requestBody,
			HttpRequestMethod httpRequestMethod, Map<String, String> headers)
			throws IOException, HttpRequestMethodNotSupportedException
	{
		return doHttpCall(url, params, httpRequestMethod, requestBody, headers, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * @param url {@link String}
	 * @param params {@link Map} of {@link String} vs {@link String}
	 * @param httpRequestMethod the HTTP request method
	 * @param requestBody {@link String}
	 * @param headers {@link Map} of {@link String} vs {@link String}
	 * @param timeout {@link Long}
	 * @param timeUnit {@link TimeUnit}
	 * @return {@link Map} of {@link String} vs {@link String}
	 * @throws IOException Throws {@link IOException}
	 * @throws HttpRequestMethodNotSupportedException Throws {@link HttpRequestMethodNotSupportedException}
	 */
	public static Map<String, String> doHttpCall(String url, Map<String, String> params,
			HttpRequestMethod httpRequestMethod, String requestBody, Map<String, String> headers, long timeout,
			TimeUnit timeUnit) throws IOException, HttpRequestMethodNotSupportedException
	{
		Long timeOutInMillis = TimeUnit.MILLISECONDS.convert(timeout, timeUnit);
		if (HttpRequestMethod.GET.equals(httpRequestMethod) && !Strings.isNullOrEmpty(requestBody))
			throw new HttpRequestMethodNotSupportedException("Request Body not supported for Get Requests");

		if (params != null)
		{
			String paramString = ParameterStringBuilder.getParamsString(params);
			url = url + "?" + paramString;
		}

		URL httpURL = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) httpURL.openConnection();
		connection.setRequestMethod(httpRequestMethod.getValue());

		connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		connection.setRequestProperty("User-Agent", "JAVA_HTTP_REQUEST");

		//set request headers
		if (headers != null)
		{
			for (Map.Entry<String, String> headerEntry : headers.entrySet())
			{
				connection.setRequestProperty(headerEntry.getKey(), headerEntry.getValue());
			}
		}

		//set url params in case of non-get requests
		if (!HttpRequestMethod.GET.equals(httpRequestMethod) && !Strings.isNullOrEmpty(requestBody))
		{
			connection.setDoOutput(true); //required if params needs to be set
			DataOutputStream dataOutputStream = new DataOutputStream(connection.getOutputStream());
			dataOutputStream.writeBytes(requestBody);
			dataOutputStream.flush();
			dataOutputStream.close();
		}

		//set connection timeout
		if (timeOutInMillis != 0)
			connection.setConnectTimeout(timeOutInMillis.intValue());

		int statusCode = connection.getResponseCode();
		String responseMessage = connection.getResponseMessage();

		//Read the response only if response code is 200 or 201
		StringBuffer responseString = new StringBuffer();
		if (statusCode == 200 || statusCode == 201)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null)
			{
				responseString.append(inputLine);
			}
			in.close();
		}

		//Disconnect the connection
		connection.disconnect();

		Map<String, String> response = new HashMap<>();
		response.put("response", responseString.toString());
		response.put("response-code", String.valueOf(statusCode));
		response.put("response-message", responseMessage);

		return response;
	}

	enum HttpRequestMethod
	{
		POST("POST"), GET("GET"), PUT("PUT"), DELETE("DELETE");

		String val;

		HttpRequestMethod(String val)
		{
			this.val = val;
		}

		public String getValue()
		{
			return this.val;
		}
	}
}
