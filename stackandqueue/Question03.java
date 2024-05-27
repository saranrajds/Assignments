<<<<<<< HEAD
package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Question03 {

	public static void main(String[] args) {

		int numJobs = 5;
        int maxProcessingTime = 10;
        simulateJobScheduling(numJobs, maxProcessingTime);
	}

	public static void simulateJobScheduling(int numJobs, int maxProcessingTime) {
        Queue<Job> jobsQueue = new LinkedList<>();
        Random random = new Random();
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        for (int i = 0; i < numJobs; i++) {
            String jobName = "Job" + (i + 1);
            int processingTime = random.nextInt(maxProcessingTime) + 1;
            Job job = new Job(jobName, processingTime);
            jobsQueue.add(job);
        }

        int currentTime = 0;

        while (!jobsQueue.isEmpty()) {
            Job currentJob = jobsQueue.poll();

            currentJob.setWaitingTime(currentTime);

            System.out.println("Processing " + currentJob.getName() + " (Time needed: " + currentJob.getProcessingTime() + ")");
            currentTime += currentJob.getProcessingTime();

            currentJob.setTurnaroundTime(currentTime);

            totalWaitingTime += currentJob.getWaitingTime();
            totalTurnaroundTime += currentJob.getTurnaroundTime() - currentJob.getWaitingTime();
        }

        double avgWaitingTime = (double) totalWaitingTime / numJobs;
        double avgTurnaroundTime = (double) totalTurnaroundTime / numJobs;

        System.out.println("\nJob scheduling simulation results:");
        System.out.println("Total number of jobs: " + numJobs);
        System.out.printf("Average waiting time: %.2f units\n", avgWaitingTime);
        System.out.printf("Average turnaround time: %.2f units\n", avgTurnaroundTime);
    }
}
=======
package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Question03 {

	public static void main(String[] args) {

		int numJobs = 5;
        int maxProcessingTime = 10;
        simulateJobScheduling(numJobs, maxProcessingTime);
	}

	public static void simulateJobScheduling(int numJobs, int maxProcessingTime) {
        Queue<Job> jobsQueue = new LinkedList<>();
        Random random = new Random();
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        for (int i = 0; i < numJobs; i++) {
            String jobName = "Job" + (i + 1);
            int processingTime = random.nextInt(maxProcessingTime) + 1;
            Job job = new Job(jobName, processingTime);
            jobsQueue.add(job);
        }

        int currentTime = 0;

        while (!jobsQueue.isEmpty()) {
            Job currentJob = jobsQueue.poll();

            currentJob.setWaitingTime(currentTime);

            System.out.println("Processing " + currentJob.getName() + " (Time needed: " + currentJob.getProcessingTime() + ")");
            currentTime += currentJob.getProcessingTime();

            currentJob.setTurnaroundTime(currentTime);

            totalWaitingTime += currentJob.getWaitingTime();
            totalTurnaroundTime += currentJob.getTurnaroundTime() - currentJob.getWaitingTime();
        }

        double avgWaitingTime = (double) totalWaitingTime / numJobs;
        double avgTurnaroundTime = (double) totalTurnaroundTime / numJobs;

        System.out.println("\nJob scheduling simulation results:");
        System.out.println("Total number of jobs: " + numJobs);
        System.out.printf("Average waiting time: %.2f units\n", avgWaitingTime);
        System.out.printf("Average turnaround time: %.2f units\n", avgTurnaroundTime);
    }
}
>>>>>>> 3610e59443eaa8a9a7e03cf305c60ba9ba85572f
