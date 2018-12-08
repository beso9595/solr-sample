package beso9595.sample.solr;

import beso9595.sample.solr.model.File;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException, SolrServerException {
        String url = "http://localhost:8983/solr";
        SolrClient solrClient = new HttpSolrClient.Builder(url)
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000)
                .build();
        //
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery("*:*");
        QueryResponse response = solrClient.query("files", solrQuery);
        List<File> files = response.getBeans(File.class);
        //
        for (File file : files) {
            System.out.println(file.toString());
        }
    }
}
